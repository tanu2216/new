package EmployeeApp;

import java.util.ArrayList;

import com.tanu.beans.Address;
import com.tanu.beans.City;
import com.tanu.beans.Country;
import com.tanu.beans.Employee;

import EmployeeRepo.EmployeeRepo;
import EmployeeRepo.EmployeeRepoImpl;
import EmployeeService.EmployeeService;
import EmployeeService.EmployeeServiceImpl;
import Exceptions.EmployeeAlreadyExistException;
import Exceptions.EmployeeDoesNotExistException;
import Exceptions.IdCannotBeNegativeException;
import Exceptions.InvalidAddressException;
import Exceptions.NameNullException;

public class MainApp {

	public static void main(String[] args) {
	
		boolean a;
		EmployeeRepo emprepoimpl= new EmployeeRepoImpl();
		EmployeeService employeeserviceimpl= new EmployeeServiceImpl(emprepoimpl);
		Address ad=new Address();
		Country country= new Country();
		City city = new City();
		ad.setAddress("383");
		ad.setCountry(country);
		country.setCountryNmae("India");
		country.setCity(city);
		city.setCityName("Allahabad");
		
		try {
			a = employeeserviceimpl.createEmployee(101,"Sagar", ad);
			if(a)
				System.out.println("Employee added successfully");
			else
				System.out.println("Error occurred");
		} 
		catch (EmployeeAlreadyExistException e) {
			
			System.out.println(e.getMessage());
			
		} catch (NameNullException e) {

			e.getMessage();
			
		}
		catch (IdCannotBeNegativeException e) {
			e.getMessage();
		}
		catch (InvalidAddressException e) {
			e.getMessage();
		}
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		try {
			list=employeeserviceimpl.searchByName("Sagar");
			if(list==null)
				System.out.println("Employee does not exist!");
			else {
				for(int i=0;i<list.size();i++)
					System.out.println(list.get(i));		
			}
			
		} 
		catch (NameNullException e) {
			e.getMessage();
		} catch (EmployeeDoesNotExistException e) {

				System.out.println(e.getMessage());
			
		}
			
			
		}

	}
