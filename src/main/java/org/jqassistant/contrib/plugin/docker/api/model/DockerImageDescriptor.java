package org.jqassistant.contrib.plugin.docker.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import com.buschmais.xo.neo4j.api.annotation.Relation.Incoming;

@Label(value = "Image", usingIndexedPropertyOf = DockerDigestTemplate.class)
public interface DockerImageDescriptor extends DockerDescriptor, DockerDigestTemplate {

	@Incoming
	@Relation("CONTAINS_IMAGE")
	DockerRepositoryDescriptor getRepository();

	void setRepository(DockerRepositoryDescriptor dockerRepositoryDescriptor);

}
