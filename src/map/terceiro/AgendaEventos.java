package map.terceiro;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap();
    }

    public void addEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventoTreeMap);
    }
    public void obterProximoEvento(){
      LocalDate dataAtual = LocalDate.now();
      Map<LocalDate, Evento> eventos = new TreeMap<>(eventosMap);
      for (Map.Entry<LocalDate,Evento> entry: eventosMap.entrySet()) {
        if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
            System.out.println("O proximo evento: " + entry.getValue() + " será na data" + entry.getKey() );
        }
        break;
      }
    }
}
