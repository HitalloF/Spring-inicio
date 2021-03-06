package com.hitallo.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hitallo.crm.model.Cliente;
import com.hitallo.crm.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> listar(){
		System.out.println("Entrou");
		return clienteRepository.findAll();
	}
	
	@PostMapping
	public Cliente adicionar(@RequestBody Cliente cliente) {
		System.out.println("Entrou");
		return clienteRepository.save(cliente);
	}
}
