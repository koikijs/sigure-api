package koikijs.prop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("tomcat.ajp")
public class TomcatAjpProp {
	/**
	 * ajp port
	 */
	private int port;
	
	/**
	 * ajp enabled
	 */
	private boolean enabled;
}
