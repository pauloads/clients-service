package com.paulocorrea.clients.repository.specification;

import com.paulocorrea.clients.entity.Client;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClientSpecificationBuilder {

    private final List<SearchCriteria> params;

    public ClientSpecificationBuilder() {
        params = new ArrayList<SearchCriteria>();
    }

    public ClientSpecificationBuilder with(String key, Object value) {
        params.add(new SearchCriteria(key, value));
        return this;
    }

    public Specification<Client> build() {
        if (params.size() == 0) {
            return null;
        }

        List<Specification> specs = params.stream()
                .map(ClientSpecification::new)
                .collect(Collectors.toList());

        Specification result = specs.get(0);

        for (int i = 1; i < params.size(); i++) {
            result = Specification.where(result).and(specs.get(i));
        }
        return result;
    }

    public boolean hasValue(){
        return !params.isEmpty();
    }
}
