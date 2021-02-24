package edu.bu.met.cs665.subject;

import edu.bu.met.cs665.observers.Observer;

/**
 * Name: Lakshmi Swethadri
 * Date: 02/23/2021
 * Course: CS-665
 * Assignment 2
 * Description: Observable interface.
 *
 * */

public interface Observable {
	public void register(Observer o);
	public void unRegister(Observer o);
	public void notifyAllObservers(String message);
}
