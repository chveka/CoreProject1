package epam.coreProject.actions;

import java.util.List;

public class TransportContainer<T> {
    public <A> void transports (List<A> transports){
        for(A transport: transports){
            System.out.println(transport);
        }
    }
}
