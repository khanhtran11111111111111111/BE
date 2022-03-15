package com.example.demo.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Convert.UsersConvert;
import com.example.demo.DTO.UsersDTO;
import com.example.demo.Entity.UsersEntity;
import com.example.demo.Service.UsersService;


;


@CrossOrigin
@RestController
@RequestMapping("/api/users")
public class UsersAPI {
	@Autowired
	UsersConvert usersConvert;
	@Autowired
	private UsersService userService;
	// created
	@PostMapping 
	public UsersDTO save(@RequestBody UsersDTO dto) {
		UsersEntity user = usersConvert.DtoToEntity(dto);
		user=userService.saveUser(user);
		return usersConvert.entityToDto(user);
		
        
	}
	//Get all
		@GetMapping
		public	List<UsersDTO> getAlluser(){
			List<UsersEntity> findAll= userService.getAllUser();
			return usersConvert.entityToDto(findAll);
		}
		
		//Get with id 
		@GetMapping("{id}")
		public	UsersDTO findById(@PathVariable(value="id")long id ) {
		UsersEntity orElse =userService.getUserById(id);
		return usersConvert.entityToDto(orElse);
		}
		//Update
		@PutMapping("{id}")
		public UsersDTO updateUser(@PathVariable long id, @RequestBody UsersDTO dto) {

			UsersEntity user = usersConvert.DtoToEntity(dto);
			user=userService.updateUser(user, id);
			return  usersConvert.entityToDto(user);
		}
		//Delete
		@DeleteMapping("{id}")
		public ResponseEntity<UsersDTO> deleteUser(@PathVariable("id") long id	){
			userService.deleteUser(id);
			return new ResponseEntity<UsersDTO>(HttpStatus.OK);
		}
	

}
