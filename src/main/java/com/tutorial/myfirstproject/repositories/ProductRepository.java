package com.tutorial.myfirstproject.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.tutorial.myfirstproject.entities.Product;

// ProductRepository // Classe especial que acessa os dados


@Component //sem ele não é possivel instanciar a classe no outro arquivo através do @Autowired
public class ProductRepository {
														//guardando em memória, não em db
	private Map<Long, Product> map = new HashMap<>();	//Map: (dictionary em outras linguagens) Coleção de pares chave/valor
	
	public void save(Product obj) { //método para salvar categoria
		map.put(obj.getId(), obj); // Insere cate  goria no map
	}

	public Product findById(Long id) { //método req id res categoria de id correspondente
		return map.get(id);
	}
	
	public List<Product> findAll() { // método que retorna todas as categorias
		return new ArrayList<Product>(map.values()); //pega todos os valores do tipo Product e instancia uma nova lista com esses valores
	}
}


