public class PrintVisitor implements Visitor {
    @Override
    public void visit(Programmer programmer) {
        String msg = programmer.getName() + " + " + programmer.getSkill();
        System.out.println(msg);
    }

    @Override
    public void visit(ProjectLead projectLead) {
        String msg = projectLead.getName() + " + " + projectLead.getDirectReports().size();
        System.out.println(msg);
    }

    @Override
    public void visit(Manager manager) {
        String msg = manager.getName() + " + " + manager.getPerformanceRating();
        System.out.println(msg);
    }

    @Override
    public void visit(VicePresident vicePresident) {
        String msg = vicePresident.getName() + " + VP + " + vicePresident.toString();
        System.out.println(msg);
    }
}
