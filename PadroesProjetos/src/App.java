import Strategy.Comportamento;
import Strategy.ComportamentoAgressivo;
import Strategy.ComportamentoNormal;
import Strategy.CompotamentoDefensivo;
import Strategy.Robo;
import facade.Facade;
import gof.SingletonEager;
import gof.SingletonLazy;
import gof.SingletonLazyHolder;

public class App {
    public static void main(String[] args) throws Exception {
        /*
            Singleton:

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyholder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);
        lazyholder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);*/

        /* Strategy 

        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new CompotamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        */

        /* Facade */

        Facade facade = new Facade();
        facade.migrarCliente("Olavo", "15234453");
    }
}
