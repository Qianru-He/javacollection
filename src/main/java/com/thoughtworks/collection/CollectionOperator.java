package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {

		List<Integer> result = new ArrayList();
		if(left<right)
		{
			for(int i=0,j=left;j<=right;++i,++j)
			{
				result.add(j);
			}
		}
		else
		{		
			for(int i=0,j=left;j>=right;++i,--j)
			{
				result.add(j);
			}
		}
		return result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        int count =left>right?(left-right+1)/2:(right-left+1)/2;
		int[] res = new int[count];
		List<Integer> result = new ArrayList();
		if(left<right)
		{
			for(int i=0,j=left;j<=right;++j)
			{
				if(j%2==0)
				{
					res[i] = j;
					++i;
				}
			}
		}
		else
		{		
			for(int i=0,j=left;j>=right;--j)
			{
				if(j%2==0)
				{
					res[i] = j;
					++i;
				}
			}
		}
		List<Integer> list = Arrays.stream(res).boxed().collect(Collectors.toList());
		return list;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> result = new ArrayList();
		for(int i=0;i<array.length;++i)
		{
			if(array[i]%2==0)
			{
				result.add(array[i]);
			}
		}
		return result;
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> result = new ArrayList();
		for(int i=0;i<firstArray.length;++i)
		{
			for(int j=0;j<secondArray.length;++j)
			{
				if(firstArray[i]==secondArray[j])
					result.add(firstArray[i]);
			}
		}
		return result;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
		
        List<Integer> list1 = new ArrayList();
		List<Integer> list2 = new ArrayList();
		for(int i=0;i<firstArray.length;++i)
		{
			list1.add(firstArray[i]);
		}
		for(int i=0;i<secondArray.length;++i)
		{   int j;
			for(j=0;j<firstArray.length;++j)
			{
				if(secondArray[i]==firstArray[j])
					break;
			}
			if(j==firstArray.length)
				list1.add(secondArray[i]);
		}
		
		return list1;
    }
}
