package myapp.core;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection; 
import java.util.List;
import java.util.LinkedList;

public class MapMain {
    
    public static void main (String[] args) {

        List<String> names = new LinkedList<>();
        names.add("fred");
        names.add("barney");
        names.add("wilma");
        names.add("betty");

        Map<String, BankAccount> accts = new HashMap<>();

        BankAccount fred = new BankAccount("fred");
        BankAccount barney = new BankAccount("barney");
        BankAccount wilma = new BankAccount("wilma");
        BankAccount betty = new BankAccount("betty");

        // create a simple map
        //Map<String, BankAccount> accts = new HashMap<>();
        accts.put(fred.getAccountID(), fred);
        accts.put(barney.getAccountID(), barney);
        accts.put(wilma.getAccountID(), wilma);
        accts.put(betty.getAccountID(), betty);

        System.out.printf("size: %d\n", accts.size());
        System.out.printf("has fred: %b\n", accts.containsKey(fred.getAccountID()));
        System.out.printf("has pebbles: %b\n", accts.containsKey("pebbles"));

        Set<String> keys = accts.keySet();
        //Collection<BankAccount> values = accts.values();

        BankAccount acct;
        for (String acctID: keys) {
            acct = accts.get(acctID);
            System.out.printf("acctid = %s, name = %s\n", acctID, acct.getName());
        }

        
    }
}
