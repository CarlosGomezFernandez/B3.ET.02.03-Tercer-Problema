package TercerEjercicio;
import java.util.*;

public class TercerEjercicio {
	static int calculoAdecuacionFuncional(int completitudFuncional, int correccionFuncional, int pertinenciaFuncional) {
		int adecuacionFuncional = 0;

		if (completitudFuncional >= 0 && completitudFuncional < 10) {
			completitudFuncional = 0;
		} else {
			if (completitudFuncional >= 10 && completitudFuncional < 35) {
				completitudFuncional = 1;
			} else {
				if (completitudFuncional >= 35 && completitudFuncional < 50) {
					completitudFuncional = 2;
				} else {
					if (completitudFuncional >= 50 && completitudFuncional < 70) {
						completitudFuncional = 2;
					} else {
						if (completitudFuncional >= 70 && completitudFuncional < 90) {
							completitudFuncional = 3;
						} else {
							if (completitudFuncional >= 90 && completitudFuncional <= 100) {
								completitudFuncional = 4;
							}
						}
					}
				}
			}
		}

		if (correccionFuncional >= 0 && correccionFuncional < 10) {
			correccionFuncional = 0;
		} else {
			if (correccionFuncional >= 10 && correccionFuncional < 35) {
				correccionFuncional = 1;
			} else {
				if (correccionFuncional >= 35 && correccionFuncional < 50) {
					correccionFuncional = 1;
				} else {
					if (correccionFuncional >= 50 && correccionFuncional < 70) {
						correccionFuncional = 2;
					} else {
						if (correccionFuncional >= 70 && correccionFuncional < 90) {
							correccionFuncional = 3;
						} else {
							if (correccionFuncional >= 90 && correccionFuncional <= 100) {
								correccionFuncional = 5;
							}
						}
					}
				}
			}
		}

		if (pertinenciaFuncional >= 0 && pertinenciaFuncional < 10) {
			pertinenciaFuncional = 0;
		} else {
			if (pertinenciaFuncional >= 10 && pertinenciaFuncional < 35) {
				pertinenciaFuncional = 2;
			} else {
				if (pertinenciaFuncional >= 35 && pertinenciaFuncional < 50) {
					pertinenciaFuncional = 2;
				} else {
					if (pertinenciaFuncional >= 50 && pertinenciaFuncional < 70) {
						pertinenciaFuncional = 3;
					} else {
						if (pertinenciaFuncional >= 70 && pertinenciaFuncional < 90) {
							pertinenciaFuncional = 4;
						} else {
							if (pertinenciaFuncional >= 90 && pertinenciaFuncional <= 100) {
								pertinenciaFuncional = 5;
							}
						}
					}
				}
			}
		}

		adecuacionFuncional = Math.min((Math.min(completitudFuncional, correccionFuncional)), pertinenciaFuncional);
		return adecuacionFuncional;

	}

	static int calculoMantenibilidad(int modularidad, int reusabilidad, int analizabilidad, int modificabilidad,
			int testeabilidad) {
		int mantenibilidad = 0;

		if (modularidad >= 0 && modularidad < 10) {
			modularidad = 0;
		} else {
			if (modularidad >= 10 && modularidad < 35) {
				modularidad = 1;
			} else {
				if (modularidad >= 35 && modularidad < 50) {
					modularidad = 2;
				} else {
					if (modularidad >= 50 && modularidad < 70) {
						modularidad = 2;
					} else {
						if (modularidad >= 70 && modularidad < 90) {
							modularidad = 3;
						} else {
							if (modularidad >= 90 && modularidad <= 100) {
								modularidad = 4;
							}
						}
					}
				}
			}
		}

		if (reusabilidad >= 0 && reusabilidad < 10) {
			reusabilidad = 0;
		} else {
			if (reusabilidad >= 10 && reusabilidad < 35) {
				reusabilidad = 1;
			} else {
				if (reusabilidad >= 35 && reusabilidad < 50) {
					reusabilidad = 2;
				} else {
					if (reusabilidad >= 50 && reusabilidad < 70) {
						reusabilidad = 2;
					} else {
						if (reusabilidad >= 70 && reusabilidad < 90) {
							reusabilidad = 3;
						} else {
							if (reusabilidad >= 90 && reusabilidad <= 100) {
								reusabilidad = 5;
							}
						}
					}
				}
			}
		}

		if (analizabilidad >= 0 && analizabilidad < 10) {
			analizabilidad = 0;
		} else {
			if (analizabilidad >= 10 && analizabilidad < 35) {
				analizabilidad = 0;
			} else {
				if (analizabilidad >= 35 && analizabilidad < 50) {
					analizabilidad = 1;
				} else {
					if (analizabilidad >= 50 && analizabilidad < 70) {
						analizabilidad = 2;
					} else {
						if (analizabilidad >= 70 && analizabilidad < 90) {
							analizabilidad = 3;
						} else {
							if (analizabilidad >= 90 && analizabilidad <= 100) {
								analizabilidad = 5;
							}
						}
					}
				}
			}
		}

		if (modificabilidad >= 0 && modificabilidad < 10) {
			modificabilidad = 0;
		} else {
			if (modificabilidad >= 10 && modificabilidad < 35) {
				modificabilidad = 1;
			} else {
				if (modificabilidad >= 35 && modificabilidad < 50) {
					modificabilidad = 2;
				} else {
					if (modificabilidad >= 50 && modificabilidad < 70) {
						modificabilidad = 3;
					} else {
						if (modificabilidad >= 70 && modificabilidad < 90) {
							modificabilidad = 4;
						} else {
							if (modificabilidad >= 90 && modificabilidad <= 100) {
								modificabilidad = 5;
							}
						}
					}
				}
			}
		}

		if (testeabilidad >= 0 && testeabilidad < 10) {
			testeabilidad = 0;
		} else {
			if (testeabilidad >= 10 && testeabilidad < 35) {
				testeabilidad = 1;
			} else {
				if (testeabilidad >= 35 && testeabilidad < 50) {
					testeabilidad = 1;
				} else {
					if (testeabilidad >= 50 && testeabilidad < 70) {
						testeabilidad = 2;
					} else {
						if (testeabilidad >= 70 && testeabilidad < 90) {
							testeabilidad = 4;
						} else {
							if (testeabilidad >= 90 && testeabilidad <= 100) {
								testeabilidad = 4;
							}
						}
					}
				}
			}
		}

		mantenibilidad = Math.min(
				Math.min(Math.min(modularidad, reusabilidad), Math.min(analizabilidad, modificabilidad)),
				testeabilidad);
		return mantenibilidad;

	}

	static int calculoNivelCalidad(int adecuacionFuncional, int mantenibilidad) {
		int nivelCalidad = 0;

		if (adecuacionFuncional == 1) {
			nivelCalidad = 1;
		} else {
			if (adecuacionFuncional == 2) {
				if (mantenibilidad == 1) {
					nivelCalidad = 1;
				} else {
					nivelCalidad = 2;
				}
			} else {
				if (adecuacionFuncional == 3) {
					if (mantenibilidad == 1 || mantenibilidad == 2) {
						nivelCalidad = 2;
					} else {
						nivelCalidad = 3;
					}
				} else {
					if (adecuacionFuncional == 4) {
						if (mantenibilidad != 5) {
							nivelCalidad = 3;
						} else {
							nivelCalidad = 4;
						}
					} else {
						if (adecuacionFuncional == 5) {
							if (mantenibilidad == 1 || mantenibilidad == 2) {
								nivelCalidad = 3;
							} else {
								if (mantenibilidad == 3 || mantenibilidad == 4) {
									nivelCalidad = 4;
								} else {
									nivelCalidad = 5;
								}
							}
						}
					}
				}
			}
		}

		if (nivelCalidad >= 3) {
			System.out.println("Producto software certificable");
		} else {
			System.out.println("Producto software no certificable");
		}

		return nivelCalidad;
	}

	static void introducirValores() {
		Scanner TECLADO = new Scanner(System.in);
		try {
			System.out.println("Introduzca la medici�n base de la completitud funcional: ");
			int completitudFuncional = TECLADO.nextInt();
			if (completitudFuncional < 0 || completitudFuncional > 100) {
				System.out.println(
						"[ERROR] El valor de la medici�n base de la completitud funcional debe ser un n�mero positivo no superior a 100");
				System.out.println("Finalizando el programa ...");
				System.exit(0);
			}
			System.out.println("Introduzca la medici�n base de la correcci�n funcional: ");
			int correccionFuncional = TECLADO.nextInt();
			if (correccionFuncional < 0 || correccionFuncional > 100) {
				System.out.println(
						"[ERROR] El valor de la medici�n base de la correcci�n funcional debe ser un n�mero positivo no superior a 100");
				System.out.println("Finalizando el programa ...");
				System.exit(0);
			}
			System.out.println("Introduzca la medici�n base de la pertinencia funcional: ");
			int pertinenciaFuncional = TECLADO.nextInt();
			if (pertinenciaFuncional < 0 || pertinenciaFuncional > 100) {
				System.out.println(
						"[ERROR] El valor de la medici�n base de la pertinencia funcional debe ser un n�mero positivo no superior a 100");
				System.out.println("Finalizando el programa ...");
				System.exit(0);
			}
			System.out.println("Introduzca la medici�n base de la modularidad: ");
			int modularidad = TECLADO.nextInt();
			if (modularidad < 0 || modularidad > 100) {
				System.out.println(
						"[ERROR] El valor de la medici�n base de la modularidad debe ser un n�mero positivo no superior a 100");
				System.out.println("Finalizando el programa ...");
				System.exit(0);
			}
			System.out.println("Introduzca la medici�n base de la reusabilidad: ");
			int reusabilidad = TECLADO.nextInt();
			if (reusabilidad < 0 || reusabilidad > 100) {
				System.out.println(
						"[ERROR] El valor de la medici�n base de la reusabilidad debe ser un n�mero positivo no superior a 100");
				System.out.println("Finalizando el programa ...");
				System.exit(0);
			}
			System.out.println("Introduzca la medici�n base de la analizabilidad: ");
			int analizabilidad = TECLADO.nextInt();
			if (analizabilidad < 0 || analizabilidad > 100) {
				System.out.println(
						"[ERROR] El valor de la medici�n base de la analizabilidad debe ser un n�mero positivo no superior a 100");
				System.out.println("Finalizando el programa ...");
				System.exit(0);
			}
			System.out.println("Introduzca la medici�n base de la modificabilidad: ");
			int modificabilidad = TECLADO.nextInt();
			if (modificabilidad < 0 || modificabilidad > 100) {
				System.out.println(
						"[ERROR] El valor de la medici�n base de la modificabilidad debe ser un n�mero positivo no superior a 100");
				System.out.println("Finalizando el programa ...");
				System.exit(0);
			}
			System.out.println("Introduzca la medici�n base de la testeabilidad: ");
			int testeabilidad = TECLADO.nextInt();
			if (testeabilidad < 0 || testeabilidad > 100) {
				System.out.println(
						"[ERROR] El valor de la medici�n base de la testeabilidad debe ser un n�mero positivo no superior a 100");
				System.out.println("Finalizando el programa ...");
				System.exit(0);
			}
			int adecuacionFuncional = calculoAdecuacionFuncional(completitudFuncional, correccionFuncional,
					pertinenciaFuncional);
			System.out.println(
					"El valor obtenido en la adecuaci�n funcional, con los valores en completitud funcional de "
							+ completitudFuncional + ", en correcci�n funcional de " + correccionFuncional
							+ " y en pertinencia funcional de " + pertinenciaFuncional + ", es de "
							+ adecuacionFuncional);
			int mantenibilidad = calculoMantenibilidad(modularidad, reusabilidad, analizabilidad, modificabilidad,
					testeabilidad);
			System.out.println("El valor obtenido en la mantenibilidad, con los valores en modularidad de "
					+ modularidad + ", en reusabilidad de " + reusabilidad + ", en analizabilidad de " + analizabilidad
					+ ", en modificabilidad de " + modificabilidad + " y en testeabilidad de " + testeabilidad
					+ ", es de " + mantenibilidad);
			int nivelCalidad = calculoNivelCalidad(adecuacionFuncional, mantenibilidad);
			System.out.println("El valor obtenido en el nivel de calidad, con los valores en adecuaci�n funcional de "
					+ adecuacionFuncional + " y en mantenibilidad de " + mantenibilidad + ", es de " + nivelCalidad);
		} catch (InputMismatchException ex) {
			System.out.println("[ERROR] Caracter introducido err�neo. Finalizando el programa ...");
		}
	}

	public static void main(String[] args) {
		introducirValores();
	}
}