package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Iterator;
public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> result = new ArrayList();
		for(Integer elem:this.array)
		{
			if(elem%2==0)
				result.add(elem);
		}
		return result;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> result = new ArrayList();
		for(Integer elem:this.array)
		{
			if(elem%3==0)
				result.add(elem);
		}
		return result;
    }
	public List<Integer> getDifferentElements() {
		List<Integer> result = new ArrayList();
		for(Integer elem:this.array)
		{
			if(!result.contains(elem))
			{
				result.add(elem);
			}
		}
		return result;
    }
    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> result = new ArrayList();
		for(Integer elem:firstList)
		{
			for(Integer elem1:secondList)
			if(elem==elem1)
			{
				result.add(elem);
			}
		}
		return result;
    }

    
}