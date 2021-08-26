package quickSort;

import java.util.Comparator;

public class Movie {
	private String name;
	private String hname;
	private int year;
	private int count;
	
	public Movie(String name, String hname,int year , int count) {
		this.name = name;
		this.hname = hname;
		this.year = year;
		this.count = count;
		
	}
	public static class CountOrder implements Comparator<Movie>{//���� ������

		@Override
		public int compare(Movie m1, Movie m2) {
			// TODO Auto-generated method stub
			if(m1.count < m2.count) {
				return -1;
			}
			if(m1.count > m2.count)
			{
				return +1;
			}
			return 0;
			
		}
		
	}public static class CountOrderR implements Comparator<Movie>{//���� ������

		@Override
		public int compare(Movie m1, Movie m2) {
			// TODO Auto-generated method stub
			if(m1.count < m2.count) {
				return +1;
			}
			if(m1.count > m2.count)
			{
				return -1;
			}
			return 0;
			
		}
		
	}
	public static class YearOrder implements Comparator<Movie>{//�����ȼ�

		@Override
		public int compare(Movie m1, Movie m2) {
			// TODO Auto-generated method stub
			if(m1.year < m2.year) {
				return -1;
			}
			if(m1.year > m2.year)
			{
				return +1;
			}
			return 0;
			
		}
		
	}
	public static class YearOrderR implements Comparator<Movie>{//�ֽż�

		@Override
		public int compare(Movie m1, Movie m2) {
			// TODO Auto-generated method stub
			if(m1.year < m2.year) {
				return +1;
			}
			if(m1.year > m2.year)
			{
				return -1;
			}
			return 0;
			
		}
		
	}
	public static class NameOrder implements Comparator<Movie>//�����
	{

		@Override
		public int compare(Movie m1, Movie m2) {
			// TODO Auto-generated method stub
			
			return m1.name.compareTo(m2.name);
		}
		
	}
	
	public static class HNameOrder implements Comparator<Movie>//�̸���
	{

		@Override
		public int compare(Movie m1, Movie m2) {
			// TODO Auto-generated method stub
			
			return m1.hname.compareTo(m2.hname);
		}
		
	}
	
	public String toString()
	{
		return name+"\t"+ hname +"\t"+  year +"\t"+ count;
	}
	

}
