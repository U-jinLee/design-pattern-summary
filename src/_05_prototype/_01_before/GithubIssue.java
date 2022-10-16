package _05_prototype._01_before;

public class GithubIssue implements Cloneable {
    private Long id;
    private String title;
    private GithubRepository repository;
    public GithubIssue(GithubRepository repository) {
        this.repository = repository;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();

        GithubIssue githubIssue = new GithubIssue(repository);

        return githubIssue;
    }
}
