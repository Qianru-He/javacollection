package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum = 0;
		int left = 0;
		int right = 0;
		if(leftBorder<rightBorder)
		{
			left=leftBorder;
			right=rightBorder;
		}
		else
		{
			left=rightBorder;
			right=leftBorder;
		}
        for (int i = left; i <= right; i++) {
            if (i % 2 == 0) {
                sum += i;
            }

        }
		return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sum = 0;
		int left = 0;
		int right = 0;
		if(leftBorder<rightBorder)
		{
			left=leftBorder;
			right=rightBorder;
		}
		else
		{
			left=rightBorder;
			right=leftBorder;
		}
        for (int i = left; i <= right; i++) {
            if (i % 2 != 0) {
                sum += i;
            }

        }
		return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
       int sum = 0;
	   for(Integer element:arrayList)
	   {
		   sum+=element*3+2;
	   }
	   return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
		List<Integer> result = new ArrayList();
		Integer tmp;
		for(Integer element:arrayList)
		{
			if(element%2!=0)
				tmp=element*3+2;
			else
				tmp = element;
			result.add(tmp);
		}
		return result;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
		int sum = 0;
		for(Integer element:arrayList)
	    {
		    if(element%2!=0)
				sum+=element*3+5;
	    }
	   return sum;
    }
	public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> result = new ArrayList();
		int count = arrayList.size();
		int tmp;
		for(int i =0;i+1<count;++i)
		{
			tmp=arrayList.get(i)+arrayList.get(i+1);
			tmp=tmp*3;
			result.add(tmp);
		}
		return result;
    }
    public double getMedianOfEven(List<Integer> arrayList) {
        List<Integer> list = new ArrayList();
		double result;
		for(Integer element:arrayList)
	    {
		    if(element%2==0)
				list.add(element);
	    }
		Collections.sort(list);
		int count = list.size();
		if(count%2==0)
			result = (list.get(count/2-1)+list.get(count/2))/2;
		else
			result = list.get(count/2);
		return result;
			
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        int count = 0;
		int sum = 0;
		double result;
		for(Integer element:arrayList)
		{
			if(element%2==0)
			{
				sum+=element;
				count++;
			}
		}
		result = sum/count;
		return result;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> result = new ArrayList();
		for(Integer element:arrayList)
		{
			if(element%2==0)
				result.add(element);
		}
		for(Integer elem:result)
		{
			if(elem==specialElment)
			{
				return true;
			}
		}
		return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> result = new ArrayList();
		for(Integer element:arrayList)
		{
			if(element%2==0&&(!result.contains(element)))
				result.add(element);
		}
		return result;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> evenList = new ArrayList();
		List<Integer> oddList = new ArrayList();
		for(Integer element:arrayList)
		{
			if(element%2==0)
				evenList.add(element);
			else
				oddList.add(element);
		}
		Collections.sort(evenList);
		Collections.sort(oddList);
		Collections.reverse(oddList);
		evenList.addAll(oddList);
		return evenList;
    }

    
}
