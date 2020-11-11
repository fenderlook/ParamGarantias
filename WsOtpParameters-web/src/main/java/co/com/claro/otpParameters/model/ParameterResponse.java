package co.com.claro.otpParameters.model;

import co.com.claro.otpParameters.entity.ParameterOtp;
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
    private List<ParameterOtp> parameters;

    @Getter
    @Setter
    @XmlElement(required = true)
    private GenericResponse response;

}
