package com.tutorial.myfirstproject.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.tutorial.myfirstproject.entities.Category;

// CategoryRepository // Classe especial que acessa os dados


@Component //sem ele não é possivel instanciar a classe no outro arquivo através do @Autowired
public class CategoryRepository {
														//guardando em memória, não em db
	private Map<Long, Category> map = new HashMap<>();	//Map: (dictionary em outras linguagens) Coleção de pares chave/valor
	
	public void save(Category obj) { //método para salvar categoria
		map.put(obj.getId(), obj); // Insere cate  goria no map
	}

	public Category findById(Long id) { //método req id res categoria de id correspondente
		return map.get(id);
	}
	
	public List<Category> findAll() { // método que retorna todas as categorias
		return new ArrayList<Category>(map.values()); //pega todos os valores do tipo Category e instancia uma nova lista com esses valores
	}
}


