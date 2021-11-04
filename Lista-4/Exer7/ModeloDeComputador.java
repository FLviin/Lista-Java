package Exer7;

public class ModeloDeComputador {

    private double placaMae;
    private double processador;
    private double ram;
    private double hd;
    private double monitor;

    public ModeloDeComputador() {
        this.placaMae = 800.00;
        this.processador = 0.0;
        this.ram = 0.0;
        this.hd = 0.0;
        this.monitor = 0.0;
    }

    // setters
    public void setPlacaMae(double placaMae) {
        this.placaMae = placaMae;
    }

    public void setProcessador(double processador) {
        if (processador == 1) {
            this.processador = 700.00;
        }
        if (processador == 2) {
            this.processador = 830.00;
        }
        if (processador == 3) {
            this.processador = 910.00;
        }
    }

    public void setRam(double ram) {
        if (ram == 1) {
            this.ram = 350.00;
        }
        if (ram == 2) {
            this.ram = 700.00;
        }
        if (ram == 3) {
            this.ram = 1400.00;
        }
        if (ram == 4) {
            this.ram = 2100.00;
        }
        if (ram == 5) {
            this.ram = 2800.00;
        }
    }

    public void setHd(double hd) {
        if (hd == 1) {
            this.hd = 300.00;
        }
        if (hd == 2) {
            this.hd = 420.00;
        }
        if (hd == 3) {
            this.hd = 500.00;
        }
    }

    public void setMonitor(double monitor) {
        if (monitor == 1) {
            this.monitor = 320.00;
        }
        if (monitor == 2) {
            this.monitor = 520.00;
        }
    }

    // getters
    public double getPlacaMae() {
        return placaMae;
    }

    public double getProcessador() {
        return processador;
    }

    public double getRam() {
        return ram;
    }

    public double getHd() {
        return hd;
    }

    public double getMonitor() {
        return monitor;
    }

    public double calcularPreco() {
        return (getPlacaMae() + getProcessador() + getRam() + getHd() + getMonitor());
    }

    @Override
    public String toString() {
        return " Placa Mãe: " + placaMae + "\n Processador: " + processador + "\n Ram: " + ram + "\n HD: " + hd
                + "\n Monitor: " + monitor;
    }
}
