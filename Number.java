/**
 * Number.java
 * Created on Apr 3, 2013
 */
package ru.mipt.spring2013.class03;

public interface Number<T extends Number>
{
	T add (T other);
}
