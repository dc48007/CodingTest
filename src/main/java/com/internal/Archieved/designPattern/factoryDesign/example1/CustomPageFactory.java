package com.internal.Archieved.designPattern.factoryDesign.example1;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;

import java.lang.reflect.Field;

/**
 * To create your own custom PageFactory class, you can follow these steps:
 *
 * Define an interface or base class that represents the common behavior or contract for your page or component classes.
 *
 * Create a factory class that implements the creation logic for the instances of the page or component classes. This class will serve as your custom PageFactory.
 *
 * Inside the factory class, define factory methods or static methods that instantiate and initialize the page or component objects. These methods should return instances of the interface or base class defined in step 1.
 *
 * Implement the logic to locate and initialize the web elements within each page or component class.
 *
 * Optionally, you can use annotations or other techniques to simplify the element locating and initialization process.
 */
public class CustomPageFactory {

    public static <T> T initElements(SearchContext searchContext, Class<T> pageClass) {
        T page = instantiatePage(pageClass);
        initElements(searchContext, page);
        return page;
    }

    public static void initElements(SearchContext searchContext, Object page) {
        Field[] fields = page.getClass().getDeclaredFields();
        ElementLocatorFactory factory = new DefaultElementLocatorFactory(searchContext);
        for (Field field : fields) {
            if (isElementAnnotated(field)) {
                WebElement element = factory.createLocator(field).findElement();
                //setField(field, page, element);
            }
        }
    }

    private static <T> T instantiatePage(Class<T> pageClass) {
        try {
            return pageClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Unable to instantiate page: " + e.getMessage(), e);
        }
    }

    private static boolean isElementAnnotated(Field field) {
        return field.isAnnotationPresent(FindBy.class) || field.isAnnotationPresent(org.openqa.selenium.support.FindBys.class) || field.isAnnotationPresent(org.openqa.selenium.support.FindAll.class);
    }
/*
    private static void setField(Field field, Object page, WebElement element) {
        FieldDecorator decorator = new DefaultFieldDecorator(new CustomElementLocatorFactory(element));
        Object value = decorator.decorate(page.getClass().getClassLoader(), field);
        try {
            field.setAccessible(true);
            field.set(page, value);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Unable to set field value: " + e.getMessage(), e);
        }
    }

    private static class CustomElementLocatorFactory implements ElementLocatorFactory {

        private final WebElement element;

        public CustomElementLocatorFactory(WebElement element) {
            this.element = element;
        }

        @Override public org.openqa.selenium.support.pagefactory.ElementLocator createLocator(Field field) {
            return new org.openqa.selenium.support.pagefactory.DefaultElementLocator(element, new CustomAnnotations(field));
        }
    }*/

}
