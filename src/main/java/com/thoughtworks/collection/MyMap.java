package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> result = new ArrayList();
		for(Integer elem:this.array)
		{
			result.add(3*elem);
		}
		return result;
    }

    public List<String> mapLetter() {
        List<String> result = new ArrayList();
		for(Integer elem:this.array)
		{
			result.add(letterList.get(elem-1));
		}
		return result;
    }

    public List<String> mapLetters() {
        List<String> result = new ArrayList();
		String str;
		for(Integer elem:this.array)
		{
			int n=elem/26;
			int k=elem-n*26;
			if(n>0&&k!=0)
			{	str=letterList.get(n-1);
				if(k>0)
					str=str+letterList.get(k-1);
			}
			else
			{
				if(k==0)
				{
					str=letterList.get(n-2);
					str=str+letterList.get(25);
				}
				else
					str=letterList.get(k-1);
			}
			result.add(str);
		}
		return result;
    }

    public List<Integer> sortFromBig() {
         Collections.sort(this.array);
		 Collections.reverse(this.array);
		 return this.array;
    }

    public List<Integer> sortFromSmall() {
        Collections.sort(this.array);
		return this.array;
    }
}
