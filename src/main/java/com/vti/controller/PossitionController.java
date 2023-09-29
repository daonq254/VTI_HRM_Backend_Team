package com.vti.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.dto.PossitonDto;
import com.vti.entity.Position;
import com.vti.service.IPossitionService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
	

@RestController
@RequestMapping(value = "api/v1/possitions")
@CrossOrigin("*")
public class PossitionController {

	@Autowired
	private IPossitionService possitionService;

	@GetMapping()
	public ResponseEntity<?> getAllPossitons() {
		List<Position> entities = possitionService.getAllPossition();

		List<PossitonDto> dtos = new ArrayList<>();

//		for (Position entity : entities) {
//			PossitonDto dto = new PossitonDto(entity.getId(), entity.getName().toString());
//			dtos.add(dto);
//		}

		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	@PutMapping(value = "/{id}")
	public ResponseEntity<?> updatePossiton() {
	
		return new ResponseEntity<String>("Update successfully!", HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> deletePossiton() {
		
		return new ResponseEntity<String>("Delete successfully!", HttpStatus.OK);
	}

	@PostMapping()
	public ResponseEntity<?> createPosition() {
		return new ResponseEntity<String>("Create successfully!", HttpStatus.CREATED);
	}

}
