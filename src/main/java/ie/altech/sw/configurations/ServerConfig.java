package ie.altech.sw.configurations;

import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by Andrej Lavrinovic on 09/08/17.
 */
public class ServerConfig extends Configuration {

    @NotEmpty
    private String message;

    // getters/setters
    public String getMessage(){
        return this.message;
    }
}
