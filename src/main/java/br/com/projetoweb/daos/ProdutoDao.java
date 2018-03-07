package br.com.projetoweb.daos;

import javax.persistence.EntityManager;

import br.com.projetoweb.models.Produto;

public class ProdutoDao {

	public void persist(Produto produto) {
		EntityManager manager = new JPAUtil().getEntityManager();

		manager.getTransaction().begin();

		manager.persist(produto);

		manager.getTransaction().commit();

		manager.close();
	}

	public void remove(Produto produto) {
		EntityManager manager = new JPAUtil().getEntityManager();

		manager.getTransaction().begin();

		manager.remove(manager.merge(produto));

		manager.getTransaction().commit();

		manager.close();
	}

	public void merge(Produto produto) {
		EntityManager manager = new JPAUtil().getEntityManager();

		manager.getTransaction().begin();

		manager.merge(produto);

		manager.getTransaction().commit();

		manager.close();
	}

	/*
	public List<Produto> findAll() {
		EntityManager manager = new JPAUtil().getEntityManager();
		// arrumar issoooooo
		List<Produto> produtos = manager.createQuery("select a from Autor a").getResultList();

		manager.close();

		return produtos;
	} */
}
