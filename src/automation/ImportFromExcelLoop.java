package automation;

import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.EncryptedDocumentException;

public class ImportFromExcelLoop 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String[] arr = new String[11] ;
		for(int i = 0, j = 1; i<=2; i++)
		{
			String value = Parameterization.getData("Credentials", i, j);
			arr[i] = value;
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));

	}

}
