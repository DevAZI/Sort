package quickSort;

 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.List;
 



public class FileRead {
	private static List<Movie> hits = new ArrayList<Movie>();
	  public static void main(String[] args){
		  File file = new File("C:\\Users\\jmini\\Desktop\\movie.txt");

			String[] splitedStr = null;
try {
	BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "euc-kr"));



	String line = null;

	splitedStr = null;



	while ((line = reader.readLine()) != null) {



		splitedStr = null;

		splitedStr = line.split("\t");



		for (int i = 0; i < splitedStr.length; i++) {

			splitedStr[i] = splitedStr[i].trim();
			

		}
		//System.out.println(splitedStr[2]);

//자른 데이터를 원하는 형식에 맞게 넣기
//System.out.println(splitedStr[3]);
	//saleList.add(new Movie(splitedStr[0], splitedStr[1], Integer.valueOf(splitedStr[2]),Integer.valueOf(splitedStr[3])));
	hits.add(new Movie(splitedStr[0],splitedStr[1],Integer.valueOf(splitedStr[2]),Integer.valueOf(splitedStr[3])));
	}



	reader.close();



	
} catch (FileNotFoundException fnf) {

	fnf.printStackTrace();

} catch (IOException e) {

	e.printStackTrace();


}
hits.sort(new Movie.CountOrderR());
  	for(int i = 0; i < hits.size(); i++)
  	{
  		System.out.println(hits.get(i));
  	}
  
}
}

