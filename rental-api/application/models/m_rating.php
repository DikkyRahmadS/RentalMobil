<?php  


/**
* 
*/
class M_Rating extends CI_Model
{
	
	private $table_name = "tb_ulasan";
	// private $table_user = "tb_users";

	private $primary = "ID_ULASAN";

	function get_all($id){

        $this->db->select('*');
		$this->db->from($this->table_name);
		$this->db->where($this->primary,$id);
	
	}

		function get_by_id($id){
		$this->db->select('*');
		$this->db->from($this->table_name);
		$this->db->where($this->table_name.".ID_ULASAN",$id);
		return $this->db->get($this->table_name)->result();
		}

	function insert($data){

		#Insert data to table tb_rating
		$insert=$this->db->insert($this->table_name,$data);

		return $insert;
	}

	function delete($id){
		#Delete data destination by id
		$this->db->where($this->primary,$id);
		$delete=$this->db->delete($this->table_name);

		return $delete;
	}

	function update($id,$data){
		#Update data destination by id
		$this->db->where($this->primary,$id);
		$update=$this->db->update($this->table_name,$data);

		return $update;
	}


}

?>