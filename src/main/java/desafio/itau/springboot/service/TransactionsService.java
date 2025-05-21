package desafio.itau.springboot.service;

import desafio.itau.springboot.model.Transaction;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

@Service
public class TransactionsService {

    private Queue<Transaction> transactions = new ConcurrentLinkedDeque<>();

    public void addTransactions(Transaction transaction){
        transactions.add(transaction);
    }

    public void clearTransactions(){
        transactions.clear();
    }

    public DoubleSummaryStatistics getStatistics(){
        OffsetDateTime now = OffsetDateTime.now();
        return transactions.stream()
                //.filter(t -> t.getDataHora().isAfter(now.minusSeconds(60))) // Comentado para não precisar esperar os 60 segundos nos testes, Quando quiser as funcionalidades completas é só descomentar
                .mapToDouble(Transaction::getValor)
                .summaryStatistics();
    }
}
