function getRecordList (params) {
  return $axios({
    url: '/record/page',
    method: 'get',
    params
  })
}

// delete
const deleteRecord = (ids) => {
  return $axios({
    url: '/record',
    method: 'delete',
    params: { ids }
  })
}


// add
function addRecord (params) {
  return $axios({
    url: '/record',
    method: 'post',
    data: { ...params }
  })
}

// edit
function editRecord (params) {
  return $axios({
    url: '/record',
    method: 'put',
    data: { ...params }
  })
}

function queryRecordById (id) {
  return $axios({
    url: `/record/${id}`,
    method: 'get'
  })
}

function querySub (params) {
  console.log(params)
  return $axios({
    url: `/category`,
    method: 'get',
    params
  })
}
