/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import Exceptions.PersonNotFoundException;
import dto.PersonDTO;
import dto.PersonsDTO;

/**
 *
 * @author Lasse Emil
 */
public interface IPersonFacade {

    public PersonDTO addPerson(String fName, String lName, int phone, String street, String city, int zip);

    public PersonDTO deletePerson(int id) throws PersonNotFoundException;

    public PersonDTO getPerson(int id) throws PersonNotFoundException;

    public PersonsDTO getAllPersons();

    public PersonDTO editPerson(PersonDTO p) throws PersonNotFoundException;

}