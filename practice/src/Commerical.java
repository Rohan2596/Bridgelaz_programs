import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.bridgelabz.programs.utils.FunctionalUtil;
import com.bridgelabz.programs.utils.JsonUtil;
/**
 * Purpose : Creating program to process the data using Json
 * @author Ahetesham
 * Date : 25/02/2019
 */
public class Commerical {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		Person person1 = new Person();
		Companies company1 = new Companies();
		//creating mapper object
		ObjectMapper objectMapper = new ObjectMapper();
		//creating file objects
		File personFileObject = new File("People.json");
		File companyFileObject = new File("Companies.json");
		List<Person> personList = objectMapper.readValue(personFileObject, new TypeReference<List<Person>>() {});
		person1 = personList.get(0);
		System.out.println(person1);
		//company
		List <Companies>companyList = objectMapper.readValue(companyFileObject, new TypeReference<List<Companies>>() {});
		company1 =  companyList.get(0);
		System.out.println(company1.toString());
		System.out.println(company1);
		
		System.out.println("1.Buy Shares");
		System.out.println("2.sell Shares");
		System.out.println("Enter the choice:=");
		int ch = FunctionalUtil.singleIntegerInput();
		if(ch == 1)
		{
			System.out.println("How many shares want to buy?");
			int numberOfShares = FunctionalUtil.singleIntegerInput();
			if(numberOfShares>Integer.parseInt(company1.shareStock))
			{
				System.out.println(numberOfShares+" are not available in stock");
			}
			else
			{	
				int amnt = JsonUtil.buyShares(Integer.parseInt(person1.cash), Integer.parseInt(company1.sharePrice), numberOfShares);
				String cash = Integer.toString(amnt);
				int availableShare = Integer.parseInt(company1.shareStock);
				 availableShare =  availableShare-numberOfShares;
				person1.setCash(cash);
				String shareStock = Integer.toString(availableShare);
				company1.setShareStock(shareStock);
			}	
		}
		else if(ch==2)
		{
			System.out.println("How many shares want to sell?");
			int numberOfShares = FunctionalUtil.singleIntegerInput();
			if(numberOfShares>Integer.parseInt(person1.availableShares))
			{
				System.out.println(numberOfShares+" are not available in stock");
			}
			else
			{
				int amnt = JsonUtil.sellShares(Integer.parseInt(person1.cash), Integer.parseInt(company1.sharePrice), numberOfShares);
				String cash = Integer.toString(amnt);
				int availableShare = Integer.parseInt(person1.availableShares);
				 availableShare =  availableShare-numberOfShares;
				 person1.setCash(cash);
				 String shareStock = Integer.toString(availableShare);
					person1.setAvailableShares(shareStock);
			}
		}
		
		JsonUtil.writeObjectToJson(personList, "People.json");
		System.out.println(personList);
		JsonUtil.writeObjectToJson(companyList, "companies.json");
		System.out.println(companyList);
		
	}

}