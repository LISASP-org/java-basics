# LiSaSp Java Basics

The Java Basics bundles contains classes that provide general functionality for Java development.

## JRE

The ```basics-jre``` artifact focuses on improving testability by providing abstractions for static methods of the jre.

- ```DateFacade```
- ```DateTimeFacade```
- ```FileFacade```

Each abstraction provides is accompanied by an implementation.

## Notifications

Implements notifiers and listeners/consumers as generics and for primitive types.

## Spring JMS

Provides a generic ```JsonMessageConverter``` with class resolution.

## Spring JPA

Provides base classes for JPA entities.

- ```BaseEntity``` contains ```id``` and ```version```.
- ```TimestampedEntity``` adds a ```timestamp```.
