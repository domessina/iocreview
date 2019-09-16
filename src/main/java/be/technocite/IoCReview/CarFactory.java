package be.technocite.IoCReview;

public class CarFactory {

    private AssemblyLine assemblyLine;

    public CarFactory(AssemblyLine assemblyLine) {
        this.assemblyLine = assemblyLine;
    }

    public void startFactory() {
        assemblyLine.startAssembly();
    }
}
