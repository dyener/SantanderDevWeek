package com.example.santanderdevweek.data.local;

import com.example.santanderdevweek.data.Cartao;
import com.example.santanderdevweek.data.Cliente;
import com.example.santanderdevweek.data.Conta;

class FakeData {

   fun getLocalData(): Conta{

        val cliente = Cliente(nome = "Dyener")

        val cartao = Cartao(numero = "44123456462")

        return  Conta(numero = "445655-4",
                            agencia = "6552-4",
                            saldo = "R$ 1.550,00",
                            limite = "R$ 2.550,00",
                            cliente = cliente,
                            cartao = cartao);
    }
}
