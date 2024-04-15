package saultcollege.marygraceviaje_csd226_test2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataRepository extends JpaRepository<Data, Integer> {
    List<Data> findByDataKey(int dataKey);

}
