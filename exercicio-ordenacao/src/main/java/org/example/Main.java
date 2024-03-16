package org.example;

public class Main {
    public static void main(String[] args) {
        Eletronico[] eletronicos = new Eletronico[8];
        eletronicos[0] = new Eletronico(1, "Marca A", "Modelo X", "Tipo 1", 4000);
        eletronicos[1] = new Eletronico(2, "Marca B", "Modelo Y", "Tipo 2", 3000);
        eletronicos[2] = new Eletronico(3, "Marca C", "Modelo Z", "Tipo 1", 5000);
        eletronicos[3] = new Eletronico(4, "Marca D", "Modelo W", "Tipo 2", 3500);
        eletronicos[4] = new Eletronico(5, "Marca E", "Modelo V", "Tipo 1", 4500);
        eletronicos[5] = new Eletronico(6, "Marca F", "Modelo U", "Tipo 2", 3200);
        eletronicos[6] = new Eletronico(7, "Marca G", "Modelo T", "Tipo 1", 4200);
        eletronicos[7] = new Eletronico(8, "Marca H", "Modelo S", "Tipo 2", 3800);

        bubbleSort(eletronicos, "bateria");

        System.out.println("Ordenado por capacidade de bateria:");
        for (Eletronico eletronico : eletronicos) {
            System.out.println(eletronico);
        }

        selectionSort(eletronicos, "marca");

        System.out.println("\nOrdenado por marca:");
        for (Eletronico eletronico : eletronicos) {
            System.out.println(eletronico);
        }

        System.out.println("\nPesquisa binária (bateria existente): " + pesquisaBinaria(eletronicos, 4500));
        System.out.println("Pesquisa binária (bateria inexistente): " + pesquisaBinaria(eletronicos, 2800));
    }

    // Bubble Sort
    public static void bubbleSort(Eletronico[] array, String criterio) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (criterio.equals("bateria")) {
                    if (array[j].getBateria() > array[j + 1].getBateria()) {
                        swap(array, j, j + 1);
                    }
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(Eletronico[] array, String criterio) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (criterio.equals("marca")) {
                    if (array[j].getMarca().compareTo(array[minIndex].getMarca()) < 0) {
                        minIndex = j;
                    }
                }
            }
            swap(array, i, minIndex);
        }
    }

    // Método auxiliar para trocar elementos no array
    private static void swap(Eletronico[] array, int i, int j) {
        Eletronico temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Pesquisa binária
    public static boolean pesquisaBinaria(Eletronico[] array, int bateria) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (array[meio].getBateria() == bateria) {
                return true;
            } else if (array[meio].getBateria() < bateria) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return false;
    }
}
