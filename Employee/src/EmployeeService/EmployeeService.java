package EmployeeService;

import java.util.ArrayList;

import com.tanu.beans.Address;
import com.tanu.beans.Employee;

import Exceptions.EmployeeAlreadyExistException;
import Exceptions.EmployeeDoesNotExistException;
import Exceptions.IdCannotBeNegativeException;
import Exceptions.InvalidAddressException;
import Exceptions.NameNullException;

public interface EmployeeService {
	ArrayList<Employee> searchByName(String name) throws NameNullException, EmployeeDoesNotExistException;
	boolean createEmployee(int eid, String name, Address address) throws EmployeeAlreadyExistException, NameNullException, IdCannotBeNegativeException, InvalidAddressException;

}


