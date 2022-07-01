package com.unam.colmenat.controllers;

import com.unam.colmenat.entities.Person;
import com.unam.colmenat.services.PersonServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/people")
public class PeopleController extends BaseControllerImp<Person,PersonServiceImp>{
}
