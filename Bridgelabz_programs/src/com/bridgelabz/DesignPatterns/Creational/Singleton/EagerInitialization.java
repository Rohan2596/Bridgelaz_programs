package com.bridgelabz.DesignPatterns.Creational.Singleton;

public class EagerInitialization {
	private static final EagerInitialization instance= new EagerInitialization();
	private EagerInitialization() {}


    public static EagerInitialization getInstance(){
        return instance;
    }
}
/**
 * Eager Initialization
 * Instance of class is Created
 * Created for resources such as File System,Database 
 * con:-even if client application is not been used
 */

