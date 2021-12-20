package com.example.springbootstartercouchbase.repo;

import com.example.springbootstartercouchbase.model.Employee;
import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends CouchbaseRepository<Employee, Integer> {
}
