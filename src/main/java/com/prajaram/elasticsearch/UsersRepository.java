package com.prajaram.elasticsearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

public interface UsersRepository extends ElasticsearchCrudRepository<User, Integer> {

}
