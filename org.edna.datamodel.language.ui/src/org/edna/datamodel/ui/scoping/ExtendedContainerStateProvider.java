package org.edna.datamodel.ui.scoping;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.containers.IAllContainersState;
import org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions;
import org.eclipse.xtext.ui.containers.ContainerStateProvider;

import com.google.common.collect.Lists;

public class ExtendedContainerStateProvider extends ContainerStateProvider {

    public static class RsContainerState extends AdapterImpl implements
            IAllContainersState {

        private final static String HANDLE = "default";

        public RsContainerState(final IResourceDescriptions rs) {
            super();
            this.rs = rs;
        }

        //@Override
        public Collection<URI> getContainedURIs(final String containerHandle) {
            final List<URI> uris = Lists.newArrayList();
            for (final IResourceDescription r : this.rs
                    .getAllResourceDescriptions()) {
                uris.add(r.getURI());
            }
            return uris;
        }

        //@Override
        public String getContainerHandle(final URI uri) {
            return HANDLE;
        }

        //@Override
        public List<String> getVisibleContainerHandles(final String handle) {
            return Collections.singletonList(HANDLE);
        }

        private final IResourceDescriptions rs;
    }

    @Override
    public IAllContainersState get(IResourceDescriptions context) {
        if (context instanceof ResourceSetBasedResourceDescriptions)
            return new RsContainerState(context);
        return super.get(context);
    }
}