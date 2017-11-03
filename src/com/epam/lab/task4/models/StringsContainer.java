package com.epam.lab.task4.models;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StringsContainer implements List<String> {

	private static final String[] EMPTY_CONTAINER = {};
	private static final int DEFAULT_SIZE = 10;
	private static final String[] DEFAULTSIZE_EMPTY_CONTAINER = {};
	private String[] container;

	public StringsContainer(int initialSize) {
		if (initialSize > 0) {
			this.container = new String[initialSize];
			} else if (initialSize == 0) {
			this.container = EMPTY_CONTAINER;
			} else {
			throw new IllegalArgumentException(String.format("Irregular Capacity: %s", initialSize));
		}
	}

	public StringsContainer() {
		container = new String[0];
		}
	
	public StringsContainer(String[] arr) {
		container = new String[arr.length];
		container=copy(arr);
		}
	
	
	private String[] copy(String[] sourceArray) {
		String[] rezultArray=new String[sourceArray.length];
		for(int i=0;i<sourceArray.length; i++) {
			rezultArray[i]=sourceArray[i];
		}
		return rezultArray;
	}
	
	//копіює всі елементи з sourceArray в перші елементи receiveArray
	private String[] copy(String[] sourceArray, String[] receiveArray) {
		if (receiveArray.length<sourceArray.length)
			throw EXEPT
		for(int i=0;i<sourceArray.length; i++) {
			rezultArray[i]=sourceArray[i];
		}
		return rezultArray;
	}
	
	
	@Override
	public int size() {
		return container.length;
	}

	@Override
	public boolean isEmpty() {
		if (0 == size()) {
			return true;
		} else
			return false;
	}
	
	@Override
	public boolean add(String e) {
		if (isEmpty()) {
			String[] tempContainer=new String[1];
			tempContainer[0]=e;
			container=tempContainer;
			return true;
			}
		else {
			String[] tempContainer=new String[size()+1];
			
			tempContainer[size()]=e;
			container=tempContainer;
		}
		return false;
		
	}
	
	@Override
	public void add(int index, String element) {
		throw new UnsupportedOperationException();

	}

	
	@Override
	public boolean remove(Object o) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String remove(int index) {
		throw new UnsupportedOperationException();
	}
	@Override
	public String get(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String set(int index, String element) {
		throw new UnsupportedOperationException();
	}

	
	
	
	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<String> iterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object[] toArray() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(Collection<? extends String> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(int index, Collection<? extends String> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void clear() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public int indexOf(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int lastIndexOf(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator<String> listIterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator<String> listIterator(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<String> subList(int fromIndex, int toIndex) {
		throw new UnsupportedOperationException();
	}

	public String[] getContainer() {
		///!!! ВИКИНУТИ
		return container;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		throw new UnsupportedOperationException();
	}

}
