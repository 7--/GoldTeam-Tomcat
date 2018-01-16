package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Quiz")
public class Quiz {
<<<<<<< HEAD
	private int quiz_id;
	private String name;

	@Id
	@Column(name = "QUIZID")
	@GeneratedValue
	public int getId() {
		return quiz_id;
	}

	public void setId(int id) {
		this.quiz_id = id;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Quiz [id=" + quiz_id + ", name=" + name + "]";
	}

	public Quiz(String name) {
		super();
		this.name = name;
	}

	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}
=======
    private int id;
    private String name;

    @Id
    @Column(name = "QuizId")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Quiz [id=" + id + ", name=" + name + "]";
    }

    public Quiz(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Quiz() {
        super();
        // TODO Auto-generated constructor stub
    }
>>>>>>> 2455605b73364328f3bb5af962e95b687ab483fc

}
