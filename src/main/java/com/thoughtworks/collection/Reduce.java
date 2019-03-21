package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        Collections.sort(this.arrayList);
		Collections.reverse(this.arrayList);
		return this.arrayList.get(0);
    }

    public double getMinimum() {
        Collections.sort(this.arrayList);
		return this.arrayList.get(0);
    }

    public double getAverage() {
        double count = 0;
		double sum = 0;
		double result;
		for(Integer element:this.arrayList)
		{
			sum+=element;
			count++;	
		}
		result = sum/count;
		return result;
    }

    public double getOrderedMedian() {
        List<Integer> list = new ArrayList();
		double result;
		for(Integer element:this.arrayList)
	    {
				list.add(element);
	    }
		Collections.sort(list);
		int count = list.size();
		if(count%2==0)
		{
			double k = list.get(count/2-1)+list.get(count/2);
			result = k/2;
		}
		else
			result = list.get(count/2);
		return result;
    }

    public int getFirstEven() {
		int result=0;
        for(Integer element:this.arrayList)
	    {
			if(element%2==0)
			{
				result = element;
				break;
			}
			
	    }
		return result;
    }

    public int getIndexOfFirstEven() {
        int index = -1;
		for(Integer element:this.arrayList)
	    {
			index++;
			if(element%2==0)
			{
				break;
			}
			
	    }
		return index;
    }

    public boolean isEqual(List<Integer> arrayList) {
		boolean flag = true;
		if(this.arrayList.size()!=arrayList.size())
			return false;
        for(int i=0;i<arrayList.size();++i)
		{
			if(this.arrayList.get(i)!=arrayList.get(i))
			{
				flag = false;
				break;
			}
		}
		return flag;
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        int count = this.arrayList.size();
		double result;
		if(count%2==0)
		{
			double k = this.arrayList.get(count/2-1)+this.arrayList.get(count/2);
			result = k/2;
		}
		else
			result = this.arrayList.get(count/2);
		return result;
    }

    public int getLastOdd() {
        Collections.reverse(this.arrayList);
		int result=0;
        for(Integer element:this.arrayList)
	    {
			if(element%2!=0)
			{
				result = element;
				break;
			}
			
	    }
		return result;
		
    }

    public int getIndexOfLastOdd() {
        Collections.reverse(this.arrayList);
		int index = this.arrayList.size();
        for(Integer element:this.arrayList)
	    {
			index--;
			if(element%2!=0)
			{
				break;
			}
			
	    }
		return index;
    }
}
