package org.edna.datamodel.scoping;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;

import com.google.inject.Inject;

public class IndexIgnoringGlobalScopeProvider extends DefaultGlobalScopeProvider {

    public static final String RESOURCE_SET_ONLY = "org.eclipse.xtext.scoping.RESOURCE_SET_ONLY";

    @Inject
    private IResourceServiceProvider.Registry registry;

    @Override
    public IResourceDescriptions getResourceDescriptions(Resource res) {
        if (res.getResourceSet().getLoadOptions()
                .containsKey(RESOURCE_SET_ONLY)) {
            ResourceSetBasedResourceDescriptions result = new ResourceSetBasedResourceDescriptions();
            result.setContext(res);
            result.setRegistry(registry);
            return result;
        }
        return super.getResourceDescriptions(res);
    }
}

