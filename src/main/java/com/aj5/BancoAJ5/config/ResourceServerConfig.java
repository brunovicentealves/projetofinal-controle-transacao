package com.aj5.BancoAJ5.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers(HttpMethod.POST, "/usuario").permitAll()
                .antMatchers(HttpMethod.GET, "/usuario").authenticated()
                //Agencia
                .antMatchers(HttpMethod.GET, "/agencia").authenticated()
                .antMatchers(HttpMethod.GET,"/agencia/{id}" ).authenticated()
                .antMatchers(HttpMethod.POST,"/cadastraAgencia" ).authenticated()
                .antMatchers(HttpMethod.DELETE, "/agencia/{id}").authenticated()
                //Agendamento
                .antMatchers(HttpMethod.GET,"/agendamento" ).authenticated()
                .antMatchers(HttpMethod.GET,"/agendamento/{id}" ).authenticated()
                .antMatchers(HttpMethod.POST,"/cadastraAgendamento" ).authenticated()
                .antMatchers(HttpMethod.DELETE, "/agendamento/{id}").authenticated()
                //canaloperacao
                .antMatchers(HttpMethod.GET, "/canalOperacao").authenticated()
                .antMatchers(HttpMethod.GET, "/canalOperacao/{id}").authenticated()
                .antMatchers(HttpMethod.POST,"cadastraCanalOperacao" ).authenticated()
                .antMatchers(HttpMethod.DELETE,"/canalOperacao/{id}" ).authenticated()
                //cidade
                .antMatchers(HttpMethod.GET,"/cidade" ).authenticated()
                .antMatchers(HttpMethod.GET,"/cidade/{id}" ).authenticated()
                .antMatchers(HttpMethod.POST,"cadastraCidade" ).authenticated()
                .antMatchers(HttpMethod.DELETE,"/cidade/{id}" ).authenticated()
                //conta
                .antMatchers(HttpMethod.GET,"/conta" ).authenticated()
                .antMatchers(HttpMethod.GET,"/conta/{id}" ).authenticated()
                .antMatchers(HttpMethod.POST, "/cadastraConta").authenticated()
                .antMatchers(HttpMethod.DELETE,"/conta/{id}" ).authenticated()
                //contato
                .antMatchers(HttpMethod.GET,"/contato" ).authenticated()
                .antMatchers(HttpMethod.GET,"/contato/{id}" ).authenticated()
                .antMatchers(HttpMethod.POST,"/cadastraContato" ).authenticated()
                .antMatchers(HttpMethod.DELETE,"/contato/{id}" ).authenticated()
                //endereco
                .antMatchers(HttpMethod.GET,"/endereco" ).authenticated()
                .antMatchers(HttpMethod.GET,"/endereco/{id}" ).authenticated()
                .antMatchers(HttpMethod.POST, "/cadastraEndereco").authenticated()
                .antMatchers(HttpMethod.DELETE,"/endereco/{id}" ).authenticated()
                //estado
                .antMatchers(HttpMethod.GET,"/estado" ).authenticated()
                .antMatchers(HttpMethod.GET,"/estado/{id}" ).authenticated()
                .antMatchers(HttpMethod.POST, "/cadastraEstado").authenticated()
                .antMatchers(HttpMethod.DELETE,"/estado/{id}" ).authenticated()
                //limite canal conta
                .antMatchers(HttpMethod.GET,"/limiteCanalConta" ).authenticated()
                .antMatchers(HttpMethod.GET,"/limiteCanalConta/{id}" ).authenticated()
                .antMatchers(HttpMethod.POST,"/cadastraLimiteCanalConta" ).authenticated()
                .antMatchers(HttpMethod.DELETE,"/limiteCanalConta/{id}" ).authenticated()
                //limite canal
                .antMatchers(HttpMethod.GET,"/limiteCanal" ).authenticated()
                .antMatchers(HttpMethod.GET, "/limiteCanal/{id}").authenticated()
                .antMatchers(HttpMethod.POST,"/CadastraLimiteCanal" ).authenticated()
                .antMatchers(HttpMethod.DELETE, "/limiteCanal/{id}").authenticated()
                //operacao
                .antMatchers(HttpMethod.GET, "/operacao").authenticated()
                .antMatchers(HttpMethod.GET, "/operacao/{id}").authenticated()
                .antMatchers(HttpMethod.POST,"/cadastraOperacao" ).authenticated()
                .antMatchers(HttpMethod.DELETE,"/operacao/{id}" ).authenticated()
                //operacao Saque
                .antMatchers(HttpMethod.GET,"/operacaoSaque" ).authenticated()
                .antMatchers(HttpMethod.GET,"/operacaoSaque/{id}").authenticated()
                .antMatchers(HttpMethod.POST, "/cadastraOperacaoSaque").authenticated()
                .antMatchers(HttpMethod.DELETE, "/operacaoSaque/{id}").authenticated()
                //pessoa fisica contato
                .antMatchers(HttpMethod.GET,"/pessoaFisicaContato" ).authenticated()
                .antMatchers(HttpMethod.GET,"/pessoaFisiscaContato/{id}").authenticated()
                .antMatchers(HttpMethod.POST, "/cadastraPessoaFisicaContato").authenticated()
                .antMatchers(HttpMethod.DELETE,"/pessoaFisicaContato/{id}" ).authenticated()
                //pessoa fisica
                .antMatchers(HttpMethod.GET,"/pessoaFisica" ).authenticated()
                .antMatchers(HttpMethod.GET,"/pessoaFisica/{id}" ).authenticated()
                .antMatchers(HttpMethod.POST,"/cadastraPessoaFisica" ).authenticated()
                .antMatchers(HttpMethod.DELETE,"/pessoaFisica/{id}").authenticated()
                //pessoa juridica contato
                .antMatchers(HttpMethod.GET,"/pessoaJuridicaContato" ).authenticated()
                .antMatchers(HttpMethod.GET, "/pessoaJuridicaContato/{id}").authenticated()
                .antMatchers(HttpMethod.POST, "/cadastraPessoaJuridicaContato").authenticated()
                .antMatchers(HttpMethod.DELETE,"/pessoaJuridicaContato/{id}" ).authenticated()
                // pessoa juridica
                .antMatchers(HttpMethod.GET, "/pessoaJuridica").authenticated()
                .antMatchers(HttpMethod.GET, "/pessoaJuridica/{id}").authenticated()
                .antMatchers(HttpMethod.POST,"/cadastraPessoaJuridica" ).authenticated()
                .antMatchers(HttpMethod.DELETE,"/pessoaJuridica/{id}" ).authenticated()

                // taxa conta
                .antMatchers(HttpMethod.GET,"/taxaConta" ).authenticated()
                .antMatchers(HttpMethod.GET,"/taxaConta/{id}" ).authenticated()
                .antMatchers(HttpMethod.POST,"/cadastraTaxaConta" ).authenticated()
                .antMatchers(HttpMethod.DELETE,"/taxaConta/{id}" ).authenticated()
                //taxa
                .antMatchers(HttpMethod.GET,"/taxa" ).authenticated()
                .antMatchers(HttpMethod.GET,"/taxa/{id}" ).authenticated()
                .antMatchers(HttpMethod.POST,"cadastraTaxa" ).authenticated()
                .antMatchers(HttpMethod.DELETE,"/taxa/{id}" ).authenticated()
                //tipo contato
                .antMatchers(HttpMethod.GET,"/tipoContato" ).authenticated()
                .antMatchers(HttpMethod.GET, "/tipoContato/{id}").authenticated()
                .antMatchers(HttpMethod.POST,"/cadastraTipoContato" ).authenticated()
                .antMatchers(HttpMethod.DELETE,"/tipoContato/{id}" ).authenticated()
                //tipo operacao
                .antMatchers(HttpMethod.GET,"/tipoOperacao" ).authenticated()
                .antMatchers(HttpMethod.GET,"/tipoOperacao/{id}" ).authenticated()
                .antMatchers(HttpMethod.POST,"/cadastraTipoOperacao" ).authenticated()
                .antMatchers(HttpMethod.DELETE,"/tipoOperacao/{id}" ).authenticated();



    }

}
