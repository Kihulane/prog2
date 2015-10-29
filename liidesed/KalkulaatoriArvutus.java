/**
* Liides defineerib suhtluse mikrokalkulaatori kasutajaliidese ning arvutusloogika vahel.
* Liidest realiseeriv klass peab hakkama saama kuni kaheksakohaliste reaalarvudega arvutamisega.
* Ainsa käskluse sisendiks tulevad klahvivajutused kasutajaliidelt, väljundiks antakse soovitav ekraani seis.
*/
interface KalkulaatoriArvutus{
	/**
	*  Kalkulaatori klahvivajutuse peale käivituv käsklus.
	*  @param sisend klahvi kood
	*  @return arvud ekraanil pärast vajutust
	*/
	String vajutus(String sisend);
}