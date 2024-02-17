package security;

import org.antlr.v4.runtime.Token;
import org.springframework.boot.web.client.RestTemplateBuilder;

import javax.swing.text.html.Option;
import java.util.Optional;

public class TokenValidator {
   private RestTemplateBuilder restTemplateBuilder;
   public TokenValidator(RestTemplateBuilder restTemplateBuilder){
       this.restTemplateBuilder=restTemplateBuilder;

   }

    /**
     *
     * @param token token
     * @return Optional<JwtDto>
     */
    public Optional<JwtDto>validateToken(String token){
       // restTemplateBuilder.build().getForEntity()
        return Optional.empty();
    }
}
