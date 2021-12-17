package com.example.springbootstartercouchbase.repo;

import com.example.springbootstartercouchbase.model.Employee;
import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "employee", viewName = "all")
public interface EmployeeRepo extends CouchbaseRepository<Employee, Integer> {
}
