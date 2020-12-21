package co.com.claro.garParameters.model;

import co.com.claro.garParameters.entity.ParameterGar;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name="ParameterResponse")
public class ParameterResponse {

    @Getter
    @Setter
    @XmlElement(required = true)
    private List<ParameterGar> parameters;

    @Getter
    @Setter
    @XmlElement(required = true)
    private GenericResponse response;

}
